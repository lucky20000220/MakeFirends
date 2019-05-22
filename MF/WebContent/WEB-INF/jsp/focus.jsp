<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>焦点学苑</title>
<link rel="stylesheet" href="css/base.css">
<link rel="stylesheet" href="css/style.css">
</head>

<body>
<div class="head-box">
    <div class="head wrap">
          <div class="logo fl"><a href=""><img src="images/logo.png"></a></div>
          <div class="head-right fr">
              <div class="head-a fr">
                   <div class="hgt fl">
                         <div class="hgt-top">
                      
                         </div>
                   </div>
              </div>
              <div class="clearfix"></div>
              <div class="nav fr">
                  <ul>
                       <li><a href="index.html">首页</a></li>
                       <li><a href="article.html">文章</a>
                           <div class="sub-nav">
                                <div class="bich-top"></div>
                                 <div class="bich">
                                     <a href="">服饰</a>
                                     <a href="">美食</a>
                                     <a href="">出行</a>
                                     <a href="">约会</a>
                                 </div>
                           
                           </div>
                       </li>
                       <li><a href="community.html">社区</a></li>
                       <li><a href="course.html">课程</a></li>
                       <li><a href="active.html">活动</a></li>
                       <li><a href="contact.html">联系我们</a></li>
                  
                  </ul>
              </div>
              <div class="clearfix"></div>
          </div>
    </div>
</div>

<div class="content">
    <div class="col-height"></div>
    <div class="focus-banner">
           <div class="wrap">
                
                <div class="focus-a1"><img src="upload/focus-a2.png"></div>
                <div class="focus-a2"><h3><%= session.getAttribute("name") %></h3></div>
                <div class="focus-a3">
                          <div class="py-a fl">文章 20</div>
                          <div class="pyl  fl">关注 500
                              <div class="tbq">
                                  <div class="tbq-a">我是大大大</div>
                                  <div class="tbq-a">我是大大大</div>
                                  <div class="tbq-a">我是大大大</div>
                                  <div class="tbq-a">我是大大大</div>
                              </div>
                          </div>
                          <div class="py-a fl">粉丝 500</div>
                          <div class="py-b fl">收藏 80</div>
                </div>
                <div class="focus-a4"><a href="">+关注</a><span>|</span><a href="">私信</a></div>
           </div>    
    </div>
    
    <div class="focus-b-box">
      <form action="doUser" method="get">
                             <input  name="username" type="text" class="hgt-text" />
                             <input type="submit" value="搜索" />
                             <input type="hidden" name="hidden" value="sousuo" />
                     </form>
                   
                   <div class="focus-b">
                         <ul class="focus-ul">
                             <li>
                                  <div class="focu-b1"><img src="upload/focus-b.jpg"></div>
                                  <div class="focu-b2"><h3>用户名：<%= session.getAttribute("name1") %></h3></div>
                                  <div class="focu-b3"><p>性别：<%= session.getAttribute("sex") %></p></div>
                                  <div class="focu-b3"><p>职业：<%= session.getAttribute("work") %></p></div>
                                  <div class="focu-b3"><p>个人说明：<%= session.getAttribute("explain") %></p></div>
                                  <div class="focu-b4"><a href="">+关注</a><span>|</span><a href="">私信</a></div>  
                             </li>
                             
                            
                      </ul>
                     </div>
                     
    </div>  
</div>

<div class="footer">
   <div class="wrap">
      <div class="foot">
            <div class="foot-left fl">
                 <a href="">关于我们</a>
                 <a href="">加入我们</a>
                 <a href="contact.html">联系我们</a>
                 <a href="">媒体采访</a>
            </div>
            <div class="foot-c fl"><a href=""><img src="images/foot-logo.jpg"></a></div>
            <div class="foot-right fr">
                 <a href="">同城活动</a>
                 <a href="">课程资讯</a>
                 <a href="">最新发布</a>
                 <a href="">热门文章</a>
            </div>
       </div> 
       <div class="foot-btm">网页制作by云邦</div>    
   </div>
</div>


<!--登录注册弹窗-->
<!--  <div class="mask"></div>
<div class="login">
    <div class="login-title">
        <div class="login-a">登录</div>
        <div class="login-b"></div>
        <div class="login-c close">x</div>
    </div>
    <div class="login-btm">
        <div class="login-d"><input type="text" class="login-text" placeholder="注册时填写的邮箱"></div>
        <div class="login-d"><input type="password" class="login-pas" placeholder="密码"></div>
        <div class="login-d"><input type="button" class="login-btn" placeholder="登录"></div>
        <div class="login-f">
             <a href="">忘记密码</a>
             <span>还没有焦点账号?><a href="javascript:;" class="reg-href">点击注册</a></span>
        </div>
    </div>
</div>

<div class="reg">
    <div class="login-title">
        <div class="login-a">注册</div>
        <div class="login-b"></div>
        <div class="login-c close">x</div>
    </div>
    <div class="login-btm">
        <div class="login-d"><input type="text" class="login-text" placeholder="邮箱/手机号"></div>
        <div class="login-d"><input type="password" class="login-pas" placeholder="密码"></div>
        <div class="login-d"><input type="button" class="login-btn" placeholder="注册"></div>
        <div class="login-f">
             <a href="">忘记密码</a>
        </div>
    </div>
</div>
<script src="js/jquery-1.11.1.min.js"></script>
<script src="js/Action.js"></script>
<script>
  $(".page a").click(function(){
	  $(this).addClass("page-cut").siblings().removeClass("page-cut")  
	  
	})
</script>

<script>
         $(".pyl").click(function(){
					     $(this).find(".tbq").slideToggle()
					})
        </script>-->
</body>
</html>
