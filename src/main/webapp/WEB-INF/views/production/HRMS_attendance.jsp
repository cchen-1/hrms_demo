<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page contentType="text/html; charset=UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

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
    <!-- bootstrap-daterangepicker -->
    <link href="../vendors/bootstrap-daterangepicker/daterangepicker.css" rel="stylesheet">
    
    <!-- Custom Theme Style -->
    <link href="../build/css/custom.min.css" rel="stylesheet">
  </head>

  <body class="nav-md">
    <div class="container body">
      <div class="main_container">
        <div class="col-md-3 left_col">
          <div class="left_col scroll-view">
            <div class="navbar nav_title" style="border: 0;">
              <a href="index.html" class="site_title"><i class="fa fa-paw"></i> <small>人力资源管理系统</small></a>
            </div>

            <div class="clearfix"></div>

            <!-- menu profile quick info -->
            <div class="profile clearfix">
              <div class="profile_pic">
                <img src="../images/img.jpg" alt="..." class="img-circle profile_img">
              </div>
              <div class="profile_info">
                <span>Welcome,</span>
                <h2><%=(String)session.getAttribute("username")%></h2>
              </div>
            </div>
            <!-- /menu profile quick info -->

            <br />


            <!-- sidebar menu -->
            <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
              <div class="menu_section">
                <ul class="nav side-menu">
                  <li><a href="/hrms_demo/Login/index"><span> 主页 </span></a></li>

                  <li><a><i class="fa fa-sitemap"></i> 部门管理 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="/hrms_demo/Department/Info">部门信息管理</a></li>
                      <li><a href="/hrms_demo/DepartmentPost/Page">部门职位管理</a></li>
                    </ul>
                  </li>

                  <li><a><i class="fa fa-user"></i> 职员管理 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="/hrms_demo/staff/Page">职员信息管理</a></li>
                      <li><a href="/hrms_demo/staffTransfer/Page">职位调动管理</a></li>
                    </ul>
                  </li>

                  <li><a><i class="fa fa-table"></i> 考勤管理 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="/hrms_demo/Attendance/Page">考勤</a></li>
                    </ul>
                  </li>

                  <li><a><i class="fa fa-cny"></i> 薪资管理 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="/hrms_demo/tax/Page">税率表</a></li>
                      <li><a href="/hrms_demo/welfare/Page">福利表管理</a></li>
                      <li><a href="/hrms_demo/salary/Page">职员工资信息</a></li>
                      <li><a href="/hrms_demo/staffWelfare/Page">员工福利配置</a></li>
                    </ul>
                  </li>

                  <li><a><i class="fa fa-search-plus"></i> 招聘管理 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="/hrms_demo/Recruit/Page">招聘信息管理</a></li>
                      <li><a href="/hrms_demo/talentPool/Page">人才库管理</a></li>
                      <li><a href="/hrms_demo/Employment/Page">录用管理</a></li>
                    </ul>
                  </li>

                  <li><a><i class="fa fa-file-text"></i>报表管理 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="/hrms_demo/stuff/Report">职员个人信息报表</a></li>
                      <li><a href="/hrms_demo/salary/Report">职员薪资报表</a></li>
                    </ul>
                  </li>

                  <li><a><i class="fa fa-gear"></i>系统管理 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="/hrms_demo/Account/Page">用户管理</a></li>
                      <li><a href="/hrms_demo/role/Page">用户权限管理</a></li>
                      <li><a href="/hrms_demo/staff/Self">个人信息管理</a></li>
                    </ul>
                  </li>

                </ul>
              </div>

            </div>
            <!-- /sidebar menu -->

            <!-- /menu footer buttons -->
            <div class="sidebar-footer hidden-small">
              <a data-toggle="tooltip" data-placement="top" title="Settings">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="FullScreen">
                <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="Lock">
                <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="Logout" href="/hrms_demo/Login/login">
                <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
              </a>
            </div>
            <!-- /menu footer buttons -->
          </div>
        </div>

        <!-- top navigation -->
        <div class="top_nav">
          <div class="nav_menu">
            <nav>
              <div class="nav toggle">
                <a id="menu_toggle"><i class="fa fa-bars"></i></a>
              </div>

              <ul class="nav navbar-nav navbar-right">
                <li class="">
                  <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                    <img src="../images/img.jpg" alt="">John Doe
                    <span class=" fa fa-angle-down"></span>
                  </a>
                  <ul class="dropdown-menu dropdown-usermenu pull-right">
                    <li><a href="javascript:;"> 个人信息</a></li>

                    <li>
                      <a href="javascript:;">
                        <!--<span class="badge bg-red pull-right">50%</span>-->
                        <span>设置</span>
                      </a>
                    </li>

                    <li><a href="javascript:;">帮助</a></li>
                    <li><a href="/hrms_demo/Login/login"><i class="fa fa-sign-out pull-right"></i>安全退出</a></li>
                  </ul>
                </li>
              <!--
                <li role="presentation" class="dropdown">
                  <a href="javascript:;" class="dropdown-toggle info-number" data-toggle="dropdown" aria-expanded="false">
                    <i class="fa fa-envelope-o"></i>
                    <span class="badge bg-green">6</span>
                  </a>
                  <ul id="menu1" class="dropdown-menu list-unstyled msg_list" role="menu">
                    <li>
                      <a>
                        <span class="image"><img src="../images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <a>
                        <span class="image"><img src="../images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <a>
                        <span class="image"><img src="../images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>测试人</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          上次我发的信息你收到了吗，没收到，没收到，没收到，没收到，没收到，没收到，没收到。。。
                        </span>
                      </a>
                    </li>

                    <li>
                      <div class="text-center">
                        <a>
                          <strong>See All Alerts</strong>
                          <i class="fa fa-angle-right"></i>
                        </a>
                      </div>
                    </li>
                  </ul>
                </li>
              -->
              </ul>
            </nav>
          </div>

        </div>
        <!-- /top navigation -->


        <!-- page content -->
        <div class="right_col" role="main">
          <div class="">

            <div class="page-title">
              <div class="title_left">
                <h3>考勤管理</h3>
              </div>
            </div>
              <div >
                <div class="x_panel">
                  <div class="x_title">
                    <h2>考勤记录</h2>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <h3>出勤表</h3>
                    <div id="attendance_scatter" style="height:350px;"></div>

                  </div>
                </div>
              </div>
            
            <div class="clearfix"></div>
                   
          </div>

          <div class="row">
              <div class="col-md-4">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>奖惩信息</h2>
                    <ul class="nav navbar-right panel_toolbox">
                      <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                      </li>
                      <li><a class="close-link"><i class="fa fa-close"></i></a>
                      </li>
                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <c:forEach var="record" items="${rewardPunishment}">
                      <article class="media event">
                        <a class="pull-left date">
                          
                        </a>
                        <div class="media-body">
                          <span class="pull-right">$ ${record.amount}</span>
                          <strong class="title">${record.staffNo}</strong>
                          <p>${record.type}</p>
                          <p>${record.detail}</p>
                        </div>
                      </article>                      
                    </c:forEach>

                  </div>
                </div>
              </div>

              <div class="col-md-4">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>考勤异常信息</h2>
                    <ul class="nav navbar-right panel_toolbox">
                      <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                      </li>
                      <li><a class="close-link"><i class="fa fa-close"></i></a>
                      </li>
                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">


                    <c:forEach var="record" items="${attendanceError}">
                      <article class="media event">
                          <a class="pull-left date">
                            <p class="month"><fmt:formatDate value="${record.errorDate}" pattern="M" />月</p>
                            <p class="day"><fmt:formatDate value="${record.errorDate}" pattern="d" /></p>
                          </a>
                          <div class="media-body">
                            <strong class="title">${record.staffNo}</strong>
                            <p>${record.errorType}</p>
                            <p>${record.errorReason} </p>
                        </div>
                      </article>                      
                    </c:forEach>

                  </div>
                </div>
              </div>

              <div class="col-md-4">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>请假记录</h2>
                    <ul class="nav navbar-right panel_toolbox">
                      <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                      </li>
                      <li><a class="close-link"><i class="fa fa-close"></i></a>
                      </li>
                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <c:forEach var="record" items="${absence}">
                      <article class="media event">
                        <a class="pull-left date">
                          <p class="month"> <fmt:formatDate value="${record.beginDate}" pattern="M" />月</p>
                          <p class="day"><fmt:formatDate value="${record.beginDate}" pattern="d" /></p>
                          <p class="month">--------</p>
                          <p class="month">上午</p>
                          <p class="month">9:00</p>
                        </a>
                        <a class="pull-right date">
                          <p class="month"><fmt:formatDate value="${record.endDate}" pattern="M" />月</p>
                          <p class="day"><fmt:formatDate value="${record.endDate}" pattern="d" /></p>
                          <p class="month">--------</p>
                          <p class="month">下午</p>
                          <p class="month">13:00</p>
                        </a>
                        <div class="media-body">
                          <strong class="title">${record.staffNo}</strong>
                          <p>${record.reason}</p>
                        </div>
                      </article>                      
                    </c:forEach>

                  </div>
                </div>
              </div>

            </div>
        </div>
        <!-- /page content -->


        <!-- footer content -->
        <footer>
          <div class="pull-right">
            Human Resource Management System by <a href="https://www.gdufs.edu.cn/">GDUFS</a>
          </div>
          <div class="clearfix"></div>
        </footer>
        <!-- /footer content -->
      </div>
    </div>

    <!-- jQuery -->
    <script src="../vendors/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap -->
    <script src="../vendors/bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- FastClick -->
    <script src="../vendors/fastclick/lib/fastclick.js"></script>
    <!-- NProgress -->
    <script src="../vendors/nprogress/nprogress.js"></script>
    <!-- morris.js -->
    <script src="../vendors/raphael/raphael.min.js"></script>
    <script src="../vendors/morris.js/morris.min.js"></script>
    <!-- bootstrap-progressbar -->
    <script src="../vendors/bootstrap-progressbar/bootstrap-progressbar.min.js"></script>
    <!-- bootstrap-daterangepicker -->
    <script src="../vendors/moment/min/moment.min.js"></script>
    <script src="../vendors/bootstrap-daterangepicker/daterangepicker.js"></script>
    <!-- ECharts -->
    <script src="../vendors/echarts/dist/echarts.min.js"></script>
    
    <!-- Custom Theme Scripts -->
    <script type="text/javascript">
      var welfareData;
      var attendanceData= '${attendance}';
      attendanceData = eval(attendanceData);
    </script>
    <script src="../build/js/custom.js"></script>
  </body>
</html>