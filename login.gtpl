<!DOCTYPE html>
<html>
<head>
<style>
body  {
    background-image:url("images/login_background.jpg");
    background-color:#66ccFF;
}
</style>
<title>DB Password Reset Tool</title>
</head>
<body>
<h2>DB Password Reset Tool</h2>
<hr>
<div align="left">
<form action="/login" method="post">
<p>    Username:<br><input type="text" name="username" style="width:170px">
<p>    Windows Password:<br><input type="password" name="password" style="width:170px">

<p>    <br><select name="db_dropdown_list" style="width:170px">
  <option value="0" selected="selected">&ltPick Database&gt</option>
  <option value="DBPRD" >DBPRD ***</option>
  <option value="dbdev" >dbdev    </option>
</select>

<p>  New DB Password:<br><input type="password" name="DB_password" style="width:170px">

<!-- 
<p>    <input type="submit" style="font-face: 'Comic Sans MS'; font-size: larger; color: teal; background-color: #FFFFC0; border: 3pt ridge lightgrey" value="Set New DB Password">
-->

<p>  <input type="submit" class="styled-button-10" value="Set New DB Password" /> 

<style type="text/css"> 
.styled-button-10 {
        background:#5CCD00;
        background:-moz-linear-gradient(top,#5CCD00 0%,#4AA400 100%);
        background:-webkit-gradient(linear,left top,left bottom,color-stop(0%,#5CCD00),color-stop(100%,#4AA400));
        background:-webkit-linear-gradient(top,#5CCD00 0%,#4AA400 100%);
        background:-o-linear-gradient(top,#5CCD00 0%,#4AA400 100%);
        background:-ms-linear-gradient(top,#5CCD00 0%,#4AA400 100%);
        background:linear-gradient(top,#5CCD00 0%,#4AA400 100%);
        filter: progid: DXImageTransform.Microsoft.gradient( startColorstr='#5CCD00', endColorstr='#4AA400',GradientType=0);
        padding:10px 15px;
        color:#fff;
        font-family:'Helvetica Neue',sans-serif;
        font-size:16px;
        border-radius:5px;
        -moz-border-radius:5px;
        -webkit-border-radius:5px;
        border:1px solid #459A00
}
</style>


<p><br>Result: <font color={{.Color}}>{{.Status}}</font> 
<div><textarea name="outpt" style="background-color: #66ccFF;" rows=20 cols=80 readonly=true>{{printf "%s" .Log}}</textarea></div>

</form>
</div>

</body>
</html>

