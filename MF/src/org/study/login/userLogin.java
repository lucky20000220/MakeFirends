package org.study.login;

import java.io.IOException;
import java.io.InputStream;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.study.user.userHobby;
import org.study.user.userList;

public class userLogin extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		req.setCharacterEncoding("utf-8");
		String hidden=req.getParameter("hidden");
		if(hidden.equals("zuce")) {
			zuce(req,resp);
		}
		else if(hidden.equals("denglu"))  {
			denglu(req,resp);
		}
		else if(hidden.equals("sousuo")) {
			sousuo(req,resp);
		}
			
		}
	
	private void sousuo(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		// TODO Auto-generated method stub
		String resource="mybatis-config.xml";
		 InputStream inputStream=Resources.getResourceAsStream(resource);
		 SqlSessionFactory sqlSessionFactory =new SqlSessionFactoryBuilder().build(inputStream);
		 SqlSession sqlSession=sqlSessionFactory.openSession();
		String user=req.getParameter("username");
		userHobby userhobby=new userHobby();
		userhobby.setUser_name(user);
		userHobby user1=sqlSession.selectOne("org.study.mapper.MakeFriends.findUser2",userhobby); 
		if(user1!=null) {
			String user_name=user1.getUser_name();
			String user_work=user1.getUser_work();
			String user_sex=user1.getUser_sex();
			String user_explain=user1.getUser_explain();
			req.getRequestDispatcher("WEB-INF/jsp/focus.jsp").forward(req, resp);
			req.getSession().setAttribute("name1", user_name);
			req.getSession().setAttribute("work", user_work);
			req.getSession().setAttribute("sex", user_sex);
			req.getSession().setAttribute("explain", user_explain);
		}
		else {
			 System.out.println("查找用户失败！");
		}
		 sqlSession.commit();
		 sqlSession.close();
		 
	}

	private void zuce(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String resource="mybatis-config.xml";
		 InputStream inputStream=Resources.getResourceAsStream(resource);
		 SqlSessionFactory sqlSessionFactory =new SqlSessionFactoryBuilder().build(inputStream);
		 SqlSession sqlSession=sqlSessionFactory.openSession();
		String accout=req.getParameter("User_accout");
		String password=req.getParameter("User_password");
		String apassword=req.getParameter("apssword");
		if(password.equals(apassword))
		{
		 userList user_login=new userList();
		 user_login.setUser_accout(accout);
		 user_login.setUser_password(password);
		 int row=sqlSession.insert("org.study.mapper.MakeFriends.addNewUser",user_login);
		 if(row>0) {
		String name=req.getParameter("User_name");
		String sex=req.getParameter("Sex");
		String work=req.getParameter("User_work");
		String explain=req.getParameter("User_explain");
		userHobby userhobby=new userHobby();
		userhobby.setUser_name(name);
		userhobby.setUser_sex(sex);
		userhobby.setUser_work(work);
		userhobby.setUser_explain(explain);
		int rows=sqlSession.insert("org.study.mapper.MakeFriends.addNewUser2",userhobby); 
		if(rows>0) {
			String username=userhobby.User_name;
			req.getRequestDispatcher("WEB-INF/jsp/focus.jsp").forward(req, resp);
			req.getSession().setAttribute("name", username);
		}
		else
		{
			System.out.println("注册失败");
		}
		 }
		 else
		 {
			 req.getRequestDispatcher("1.jsp").forward(req, resp);;
		 }
		 sqlSession.commit();
		 sqlSession.close();}
		
	}
	private void denglu(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		// TODO Auto-generated method stub
		String resource="mybatis-config.xml";
		 InputStream inputStream=Resources.getResourceAsStream(resource);
		 SqlSessionFactory sqlSessionFactory =new SqlSessionFactoryBuilder().build(inputStream);
		 SqlSession sqlSession=sqlSessionFactory.openSession();
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		 userList user_login=new userList();
		 user_login.setUser_accout(name);
		 user_login.setUser_password(password);
		userList user = sqlSession.selectOne("org.study.mapper.MakeFriends.findUser",user_login);
		 
		System.out.println(user);
		 if(user!=null) {
			 req.getRequestDispatcher("WEB-INF/jsp/focus.jsp").forward(req, resp);
		 }
		 else
		 {
			 System.out.println("登陆账号或者密码错误");
		 }
		 sqlSession.commit();
		 sqlSession.close();
		
	}


}
