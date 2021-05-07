<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/common/css/login.css">
</head>
<body>
            <div class="container right-panel-active">
                <!-- Sign In -->
                <div class="container__form container--signup">
                    <form action="${pageContext.request.contextPath}/user/login" class="form" id="form1" method="post">
                        <h2 class="form__title">Sign In</h2>
                        <input type="text" placeholder="User" class="input" name="id" />
                        <input type="password" placeholder="Password" class="input" name="password"/>
                        <input type="hidden" name="action" value="login">
                        <a href="#" class="link">Forgot your password?</a>
                        <input type="submit" class="btn" value="Sign In"></input>
                    </form>
                </div>
                <!-- Sign Up -->
                <div class="container__form container--signin">
                    <form action="" class="form" id="form2">
                        <h2 class="form__title">Sign Up</h2>
                        <input type="text" placeholder="User" class="input" name="newName"/>
                        <input type="password" placeholder="Password" class="input" name="newPassword"/>
                        <input type="submit" class="btn" value="Sign Up"></input>
                    </form>
                </div>
    
                <!-- Overlay -->
                <div class="container__overlay">
                    <div class="overlay">
                        <div class="overlay__panel overlay--left">
                            <button class="btn" id="signIn">Sign Up</button>
                        </div>
                        <div class="overlay__panel overlay--right">
                            <button class="btn" id="signUp">Sign In</button>
                        </div>
                    </div>
                </div>
            </div>
        
     
</body>
<script src="<%=request.getContextPath()%>/common/js/login.js"></script>
</html>