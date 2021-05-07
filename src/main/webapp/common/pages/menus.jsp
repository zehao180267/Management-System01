<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/5/6
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="mt-2">
    <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
        <!-- Add icons to the links using the .nav-icon class
           with font-awesome or any other icon font library -->

        <li class="nav-item menu-open">
            <a href="#" class="nav-link active">
                <i class="nav-icon fas fa-table"></i>
                <p>
                    查看
                    <i class="fas fa-angle-left right"></i>
                </p>
            </a>
            <ul class="nav nav-treeview">
                <li class="nav-item">
                    <a href="<%=request.getContextPath()%>/allData" class="nav-link active">
                        <i class="far fa-circle nav-icon"></i>
                        <p>学生</p>
                    </a>
                </li>
                <li class="nav-item">
                    <a href="<%=request.getContextPath()%>/getAllCourses" class="nav-link">
                        <i class="far fa-circle nav-icon"></i>
                        <p>课程</p>
                    </a>
                </li>
            </ul>
        </li>
    </ul>
    </li>

    </ul>
</nav>
