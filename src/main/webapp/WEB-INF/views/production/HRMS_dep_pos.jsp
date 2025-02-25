
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
    <!-- Datatables -->
    <link href="../vendors/datatables.net-bs/css/dataTables.bootstrap.min.css" rel="stylesheet">
    <link href="../vendors/datatables.net-buttons-bs/css/buttons.bootstrap.min.css" rel="stylesheet">
    <link href="../vendors/datatables.net-fixedheader-bs/css/fixedHeader.bootstrap.min.css" rel="stylesheet">
    <link href="../vendors/datatables.net-responsive-bs/css/responsive.bootstrap.min.css" rel="stylesheet">
    <link href="../vendors/datatables.net-scroller-bs/css/scroller.bootstrap.min.css" rel="stylesheet">

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
          <!--在此写入-->
            <div class="page-title">
              <div class="title_left">
                <h3>部门管理 <small>Department Management</small></h3>
              </div>
            </div>
            <div class="clearfix"></div>
            <hr/>

            <!--表格2可勾选表格-->
              <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  <div class="x_title">
                    <h3>部门职位管理 <small>Department Post</small></h3>
                    <ul class="nav navbar-right panel_toolbox">
                      <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                      </li>
                    </ul>
                    
                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target=".bs-example-modal-md">添加</button>
                    <button type="button" class="btn btn-warning" data-toggle="modal" data-target="#editModal" onclick="posEdit()">修改</button>
                    <button type="button" class="btn btn-danger" onclick="posDelete()">删除</button>
                    <div class="clearfix"></div>
                  </div>

                  <div class="x_content">


                    <div  class="table-responsive">
                      <table id="datatable-checkbox" class="table table-striped jambo_table bulk_action">
                        <thead>
                          <tr class="headings">
                            <th>
                              <input type="checkbox" id="check-all" class="flat">
                            </th>
                            <th class="column-title">职位编号 </th>
                            <th class="column-title">部门编号 </th>
                            <th class="column-title">职位名称 </th>
                            <th class="column-title">职位薪酬 </th>
                            <th class="column-title">备注 </th>
                            <th class="bulk-actions" colspan="7">
                              <a class="antoo" style="color:#fff; font-weight:500;">Bulk Actions ( <span class="action-cnt"> </span> ) <i class="fa fa-chevron-down"></i></a>
                            </th>
                          </tr>
                        </thead>

                        <tbody>
                          
                          <c:forEach var="pos" items="${departmentsPost}">
                            <tr class="even pointer">
                              <td id="${pos.postId}"  class="a-center ">
                                <input  type="checkbox" class="flat" name="table_records">
                              </td>
                              <td class=" ">${pos.postNo}</td>
                              <td class=" ">${pos.departmentNo}</td>
                              <td class=" ">${pos.postName}</td>
                              <td class=" ">${pos.postSalary}</td>
                              <td class=" ">${pos.remark}</td>
                            </tr>                            
                          </c:forEach>
                          
                        </tbody>
                      </table>
                    </div>
              
            
                  </div>
                </div>
              </div>
        <!-- /page content -->

            <!-- 修改界面 -->

            <div class="modal fade" id = "editModal" tabindex="-1" role="dialog" aria-hidden="true">
              <div class="modal-dialog modal-md">
                <div class="modal-content">

                  <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span>
                    </button>

                    <h4 class="modal-title" id="myModalLabel">部门职位修改</h4>
                  </div>
                  <div class="modal-body">
                      <form  action="/hrms_demo/DepartmentPost/updatePost" class="form-horizontal form-label-left input_mask" method="post">
                      <input style="display:none;" id="editPosId" value="-1" name="posId">
                      
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">职位编号
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-9">
                          <input class="date-picker form-control col-md-7 col-xs-12" id="editPosNo" name="posNo" required="required" type="text">
                        </div>
                      </div>

                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">所在部门编号<span class="required"></span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-9">
                          <input class="date-picker form-control col-md-7 col-xs-12" id="editDeptNo" name="departmentNo" required="required" type="text">
                        </div>
                      </div>

                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">职位名称<span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-9">
                          <input class="date-picker form-control col-md-7 col-xs-12" id="editPosName" name="posName" required="required" type="text">
                        </div>
                      </div>

                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">职位薪酬<span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-9">
                          <input class="date-picker form-control col-md-7 col-xs-12" id = "editPosSalary" name="posSalary" required="required" type="text">
                        </div>
                      </div>

                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-6">备注</label>
                        <div class="col-md-6 col-sm-6 col-xs-9">
                          <textarea class="form-control" id="editRemark" name="remark" rows="3" placeholder='备注...'></textarea>
                        </div>
                      </div>

                      <div class="ln_solid"></div>
                      <div class="form-group">
                        <div class="col-md-9 col-sm-9 col-xs-12 col-md-offset-3">
                          <button type="button" data-dismiss="modal" class="btn btn-primary">关闭</button>
                          <button class="btn btn-primary" type="reset">清空</button>
                          <button type="submit" class="btn btn-success">提交</button>
                        </div>
                      </div>

                    </form>
                  </div>
                  

                  
                </div>
              </div>
            </div>

            <!-- 信息输入界面 -->

            <div class="modal fade bs-example-modal-md" tabindex="-1" role="dialog" aria-hidden="true">
              <div class="modal-dialog modal-md">
                <div class="modal-content">

                  <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span>
                    </button>

                    <h4 class="modal-title" id="myModalLabel">部门职位录入</h4>
                  </div>
                  <div class="modal-body">
                      <form action="/hrms_demo/DepartmentPost/addPost" class="form-horizontal form-label-left input_mask" method="post">

                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">职位编号<span class="required"></span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-9">
                          <input class="date-picker form-control col-md-7 col-xs-12" name="posNo" required="required" type="text">
                        </div>
                      </div>

                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">部门编号<span class="required"></span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-9">
                          <input class="date-picker form-control col-md-7 col-xs-12" name="departmentNo" required="required" type="text">
                        </div>
                      </div>

                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">职位名称<span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12 form-group has-feedback">
                          <input type="text" class="form-control" id="inputSuccess3" name="posName" placeholder="Name">
                          <span class="fa fa-user form-control-feedback right" aria-hidden="true"></span>
                        </div>
                      </div>

                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">职位薪酬<span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-9">
                          <input class="date-picker form-control col-md-7 col-xs-12" name="posSalary" required="required" type="text">
                        </div>
                      </div>

                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-6">备注</label>
                        <div class="col-md-6 col-sm-6 col-xs-9">
                          <textarea class="form-control" rows="3" name="remark" placeholder='备注...'></textarea>
                        </div>
                      </div>

                      <div class="ln_solid"></div>
                      <div class="form-group">
                        <div class="col-md-9 col-sm-9 col-xs-12 col-md-offset-3">
                          <button type="button" data-dismiss="modal" class="btn btn-primary">关闭</button>
                          <button class="btn btn-primary" type="reset">清空</button>
                          <button type="submit" class="btn btn-success">提交</button>
                        </div>
                      </div>

                    </form>
                  </div>
                  

                  
                </div>
              </div>
            </div>

          </div>
        </div>

        <!-- footer content -->
        <footer>
          <div class="pull-right">
            Gentelella - Bootstrap Admin Template by <a href="https://colorlib.com">Colorlib</a>
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
    <!-- iCheck -->
    <script src="../vendors/iCheck/icheck.min.js"></script>
    <!-- Datatables -->
    <script src="../vendors/datatables.net/js/jquery.dataTables.min.js"></script>
    <script src="../vendors/datatables.net-bs/js/dataTables.bootstrap.min.js"></script>
    <script src="../vendors/datatables.net-buttons/js/dataTables.buttons.min.js"></script>
    <script src="../vendors/datatables.net-buttons-bs/js/buttons.bootstrap.min.js"></script>
    <script src="../vendors/datatables.net-buttons/js/buttons.flash.min.js"></script>
    <script src="../vendors/datatables.net-buttons/js/buttons.html5.min.js"></script>
    <script src="../vendors/datatables.net-buttons/js/buttons.print.min.js"></script>
    <script src="../vendors/datatables.net-fixedheader/js/dataTables.fixedHeader.min.js"></script>
    <script src="../vendors/datatables.net-keytable/js/dataTables.keyTable.min.js"></script>
    <script src="../vendors/datatables.net-responsive/js/dataTables.responsive.min.js"></script>
    <script src="../vendors/datatables.net-responsive-bs/js/responsive.bootstrap.js"></script>
    <script src="../vendors/datatables.net-scroller/js/dataTables.scroller.min.js"></script>
    <script src="../vendors/jszip/dist/jszip.min.js"></script>
    <script src="../vendors/pdfmake/build/pdfmake.min.js"></script>
    <script src="../vendors/pdfmake/build/vfs_fonts.js"></script>

    <!-- Custom Theme Scripts -->
    <script src="../build/js/custom.min.js"></script>
    <script src="../build/js/selected.js"></script>

  </body>
</html>