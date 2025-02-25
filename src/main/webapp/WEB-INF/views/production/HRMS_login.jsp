<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>人力资源管理系统 </title>

    <!-- Bootstrap -->
    <link href="../vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="../vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="../vendors/nprogress/nprogress.css" rel="stylesheet">
    <!-- Animate.css -->
    <link href="../vendors/animate.css/animate.min.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="../build/css/custom.min.css" rel="stylesheet">
  </head>

  <body class="login">
    <div>
      <a class="hiddenanchor" id="signup"></a>
      <a class="hiddenanchor" id="signin"></a>

      <div class="login_wrapper">
        <div class="animate form login_form">
          <section class="login_content">
            <form action="/hrms_demo/Login/userLogin" method="post">
              <h1>人力资源管理系统</h1>
              <div>
                <input type="text" name = "accountNo" class="form-control" placeholder="请输入用户名" required="" />
              </div>
              <div>
                <input type="password" name = "password" class="form-control" placeholder="请输入密码" required="" />
              </div>
                <div style="height: 34px; margin-left: 100px; width:100px">
                	<input type="submit" class="btn btn-default submit" value="登陆">
                </div>
            
            <!-- 
            	<div >
                	<input type="submit" class="btn btn-default submit" value="登陆">	
            	</div>
            -->
              <br/>

			<h4 style="color: red;">${error}</h4>
              <a class="reset_pass" href="#">忘记密码?</a>

              <div class="clearfix"></div>

              <div class="separator">
                <br />
                <p class="change_link">新用户?
                  <a href="#signup" class="to_register"> 创建账号 </a>
                </p>

                <div>
                  <p>©2019 GDUFS</p>
                </div>
              </div>

            </form>
          </section>
        </div>

        <div id="register" class="animate form registration_form">
          <section class="login_content">
            <form action="/hrms_demo/userLogin" method="post">
              <h1>创建用户</h1>
              <div>
                <input type="text" Name = "accountNo" class="form-control" placeholder="请输入用户名" required="" />
              </div>
              <div>
                <input type="email" Name = "password" class="form-control" placeholder="请输邮箱" required="" />
              </div>
              <div>
                <input type="password" class="form-control" placeholder="请输入密码" required="" />
              </div>
              <div>
                <a class="btn btn-default submit" href="index.html">注册</a>
              </div>

              <div class="clearfix"></div>

              <div class="separator">
                <p class="change_link">已有账号?
                  <a href="#signin" class="to_register"> 去登陆 </a>
                </p>

                <div class="clearfix"></div>
                <br />

                <div>
                  <div><p>©2019 GDUFS</p></div>
                </div>
              </div>
            </form>
          </section>
        </div>

      </div>
    </div>
  </body>
</html>
