
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
    <!-- iCheck -->
    <link href="../vendors/iCheck/skins/flat/green.css" rel="stylesheet">
    <!-- bootstrap-daterangepicker -->
    <link href="../vendors/bootstrap-daterangepicker/daterangepicker.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="../build/css/custom.min.css" rel="stylesheet">

    <script type="text/javascript">
   
        var Data; //从后台获取的全部数据
        function getDepart() { //该方法放在<body>中，预执行
          $.ajax({
            type: "post",
            url: "../staff/select",
            success : function(data) {
              Data = data;
              $("#selectDepartment").empty();
              $.each(Data[0], function(key, val) {
                $("#selectDepartment").append(
                  '<option value='+val.departmentNo+'>' + val.departmentName+ '</option>');
              });
            }
          });
        }
        function getPost(){
          $("#selectPost").empty();
          
          var selectDepartment = document.getElementById("selectDepartment");
          var targetDepartment = selectDepartment.options[selectDepartment.selectedIndex].value;
          
          $.each(Data[1], function(key, val) {
            if(val.departmentNo == targetDepartment){
              $("#selectPost").append(
                  '<option value='+val.postNo+'>' + val.postName+ '</option>');
            }
          });
        }
      </script>
  </head>

  <body class="nav-md" onload='getDepart()'>
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
          <!--在此写入-->
            <div class="page-title">
              <div class="title_left">
                <h3>职员管理 <small>Stuff Management</small></h3>
              </div>
            </div>
            <div class="clearfix"></div>
            <hr/>

            <!--职员信息-->
            <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel" style="height: auto;">
                  <div class="x_title">
                    <h3>员工信息录入 <small>Stuff Infomation</small></h3>

                      <div style="text-align:center">
                        <a class="collapse-link"><i class="fa center-block fa-chevron-down" style="font-size:48px;"></i></a>
                      </div>
                    
                    <div class="clearfix"></div>
                  </div>

                  <div class="x_content" style="display: none;">

                    <form action="/hrms_demo/staff/addStaff" id="demo-form2" data-parsley-validate class="form-horizontal form-label-left" method="post">
                        
                      <div class="row">
                      <input style="display:none;" id="edit-staffId" value="-1" name="staffId">                        
                      <div class="col-md-4 col-sm-4 col-xs-12 form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">员工编号：<span class="required">*</span>
                        </label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input type="text" id="edit-staffNo" required="required" name="staffNo" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>

                      <div class="col-md-4 col-sm-4 col-xs-12 form-group">
                        <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">姓名：</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input id="edit-staffName" class="form-control col-md-7 col-xs-12" type="text" name="staffName">
                        </div>
                      </div>

                      <div class="col-md-4 col-sm-4 col-xs-12 form-group">
                        <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">开户银行：</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input id="edit-bank" class="form-control col-md-7 col-xs-12" type="text" name="bank">
                        </div>
                      </div>

                      </div>

                      <div class="row">
                      <div class="col-md-4 col-sm-4 col-xs-12 form-group">
                        <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">出生日期：</label>
                          <div class="col-md-9 xdisplay_inputx form-group has-feedback">
                                <input type="text" class="form-control has-feedback-left" id="single_cal4" name="birthDate" placeholder="day" aria-describedby="inputSuccess2Status4">
                                <span class="fa fa-calendar-o form-control-feedback left" aria-hidden="true"></span>
                                <span id="inputSuccess2Status4" class="sr-only">(success)</span>
                          </div>
                      </div>

                      <div class="col-md-4 col-sm-4 col-xs-12 form-group">
                        <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">微信：</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input id="edit-wechat" class="form-control col-md-7 col-xs-12" type="text" name="wechat">
                        </div>
                      </div>

                      <div class="col-md-4 col-sm-4 col-xs-12 form-group">
                        <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">银行卡号：</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input id="edit-bankAccount" class="form-control col-md-7 col-xs-12" type="text" name="bankAccount">
                        </div>
                      </div>

                      </div>
                      
                      <div class="row">
                        
                      <div class="col-md-4 col-sm-4 col-xs-12 form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">性别：</label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <div id="gender" class="btn-group" data-toggle="buttons">
                            <label class="btn btn-default " data-toggle-class="btn-primary" data-toggle-passive-class="btn-default">
                              <input type="radio" id="edit-sex" name="sex" value="男"> 男 
                            </label>
                            <label class="btn btn-default" data-toggle-class="btn-primary" data-toggle-passive-class="btn-default">
                              <input type="radio" id="edit-sex" name="sex" value="女"> 女
                            </label>
                          </div>
                        </div>
                      </div>

                      <div class="col-md-4 col-sm-4 col-xs-12 form-group">
                        <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">E-mail：</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input id="edit-email" class="form-control col-md-7 col-xs-12" type="text" name="email">
                        </div>
                      </div>
                      </div>

                      <div class="row">
                      <div class="col-md-4 col-sm-4 col-xs-12 form-group">
                        <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">毕业学校：</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input id="edit-school" class="form-control col-md-7 col-xs-12" type="text" name="school">
                        </div>
                      </div>

                      <div class="col-md-4 col-sm-4 col-xs-12 form-group">
                        <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">手机：</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input id="edit-phoneNo" class="form-control col-md-7 col-xs-12" name="phoneNo" type="text">
                        </div>
                      </div>

                      </div>

                      <div class="row">
                      <div class="col-md-4 col-sm-4 col-xs-12 form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="last-name">身份证号： <span class="required">*</span>
                        </label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input type="text" id="edit-identity" name="identity" required="required" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                        
                      <div class="col-md-4 col-sm-4 col-xs-12 form-group">
                        <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">QQ：</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input id="edit-qq" class="form-control col-md-7 col-xs-12" type="text" name="qq">
                        </div>
                      </div>

                      <div class="col-md-4 col-sm-4 col-xs-12 form-group">
                        <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">国籍：</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input id="edit-nationality" class="form-control col-md-7 col-xs-12" type="text" name="nationality">
                        </div>
                      </div>
                      </div>

                      <div class="row">
                      <div class="col-md-4 col-sm-4 col-xs-12 form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="last-name">籍贯： <span class="required">*</span>
                        </label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input type="text" id="edit-nativePlace" name="nativePlace" required="required" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>

                      <div class="col-md-4 col-sm-4 col-xs-12 form-group">
                        <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">最高学历：</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input id="edit-degree" class="form-control col-md-7 col-xs-12" type="text" name="degree">
                        </div>
                      </div>

                      <div class="col-md-4 col-sm-4 col-xs-12 form-group">
                        <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">民族：</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input id="edit-nation" class="form-control col-md-7 col-xs-12" type="text" name="nation">
                        </div>
                      </div>
                      </div>

                      <div class="row">
                      <div class="col-md-4 col-sm-4 col-xs-12 form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="last-name">所在部门： <span class="required">*</span>
                        </label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <select id="selectDepartment" name="DepartmentNo" onchange="getPost()" style="width:80px"></select><br/>
                        </div>
                      </div>

                      <div class="col-md-4 col-sm-4 col-xs-12 form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">职位：<span class="required">*</span>
                        </label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <select id="selectPost" name="postNo" style="width:80px"></select><br/>
                        </div>
                      </div>
                        
                      <div class="col-md-4 col-sm-4 col-xs-12 form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">专业：<span class="required">*</span>
                        </label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input id="edit-major" class="date-picker form-control col-md-7 col-xs-12" name="major" required="required" type="text">
                        </div>
                      </div>
                      </div>
                      
                      <div class="row">
                      <div class="col-md-12 col-sm-12 col-xs-12 form-group">
                        <label class="control-label col-md-1 col-sm-1 col-xs-12">住址： <span class="required">*</span>
                        </label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input id="edit-address" class="date-picker form-control col-md-7 col-xs-12" name="address" required="required" type="text">
                        </div>
                      </div>
                      </div>

                      <div class="row">
                      <div class="col-md-12 col-sm-12 col-xs-12 form-group">
                        <label class="control-label col-md-1 col-sm-1 col-xs-12">照片： <span class="required">*</span>
                        </label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input id="edit-photo" class="date-picker form-control col-md-7 col-xs-12" name="photo" type="text">
                        </div>
                      </div>
                      </div>


                      <div class="ln_solid"></div>
                      <div class="form-group">
                        <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
                          <button class="btn btn-primary collapse-link" type="button">取消</button>
                            <button class="btn btn-primary" type="reset">清空</button>
                          <button type="submit" class="btn btn-success">提交</button>
                        </div>
                      </div>

                    </form>

                  </div>
                </div>
              </div>
            <!--职员信息-->

            
            <div class="row">
              <div class="col-md-12">
                <div class="x_panel">
                  <div class="x_title">
                      <div class="col-md-12 col-sm-12 col-xs-12 text-center">
                        <h3>员工信息表</h3>
                      </div>

                      <div style="text-align:center">
                        <a class="collapse-link"><i class="fa fa-chevron-up center-block" style="font-size:48px;"></i></a>
                      </div>
                    
                    <div class="clearfix"></div>
                  </div>

                  <div class="x_content">
                    <div class="row">
                      

                      <div class="clearfix"></div>


                      <c:forEach var="record" items="${staffs}">
                        <div class="col-md-4 col-sm-4 col-xs-12 profile_details">
                          <div class="well profile_view">
                            <div class="col-sm-12">
                              <div class="left col-xs-7">
                                <h2>${record.staffName}</h2>
                                <p><strong>员工编号：</strong>${record.staffNo}</p>
                                <p>${record.postNo}</p>
                                <ul class="list-unstyled">
                                  <li><i class="fa fa-building"></i>住址： ${record.address} </li>
                                  <li><i class="fa fa-phone"></i>电话： ${record.phoneNo} </li>
                                </ul>
                              </div>
                              <div class="right col-xs-5 text-center">
                                <img src="../images/img.jpg" alt="" class="img-circle img-responsive">
                              </div>
                            </div>
                            <div class="col-xs-12 bottom text-center">
                              <div class="col-xs-12 col-sm-6 emphasis">
                              </div>
                              <div class="col-xs-12 col-sm-6 emphasis">
                                <button type="button" class="btn btn-danger btn-xs" onclick="delStaff('${record.staffId}')"> <i class="fa fa-times">
                                  </i> <i class="fa fa-user"></i> </button>                                
                                <button type="button" class="btn btn-primary btn-xs" onclick="editStaff('${record}')">
                                  <i class="fa fa-user"> </i> View Profile
                                </button>
                              </div>
                            </div>
                          </div>
                        </div>                        
                      </c:forEach>

                    </div>
                  </div>
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
    <!-- bootstrap-daterangepicker -->
    <script src="../vendors/moment/min/moment.min.js"></script>
    <script src="../vendors/bootstrap-daterangepicker/daterangepicker.js"></script>
    <!-- NProgress -->
    <script src="../vendors/nprogress/nprogress.js"></script>
    <!-- morris.js -->
    <script src="../vendors/raphael/raphael.min.js"></script>
    <script src="../vendors/morris.js/morris.min.js"></script>
    <!-- iCheck -->
    <script src="../vendors/iCheck/icheck.min.js"></script>


    <!-- Custom Theme Scripts -->
    <script src="../build/js/custom.js"></script>
    <script src="../build/js/selected.js"></script>

  </body>
</html>
