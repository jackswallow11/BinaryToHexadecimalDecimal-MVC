<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<meta charset="ISO-8859-1">
<head>
<title>Binary Converter</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
  <link href="https://fonts.googleapis.com/css?family=Nunito&display=swap" rel="stylesheet"> 
<style>
html {
  font-family: "Lucida Sans", sans-serif;
  color: rgb(201, 76, 76);
  background: url('./WebContent/WEB-INF/linear-gradient.png');

}
body {
  background-color:linen;
}

.center {
  margin: auto;
  width: 60%;
  border: 1px solid #000000;
  padding: 10px;
  background-color: #ffffff;
  align-content: center;
}
p{
 position: absolute;
  right: 200px;
  width: 300px;
  padding: 5px;
  font-size: 12px;
  color:#000000;
}

</style>

</head>
<div class="center">
<h2>
Binary to Decimal and Hexadecimal Converter
</h2>
<h3>
Please Enter Your Binary Value
</h3>

<form action="Driver" method="post">
  (Number can be either 0 or 1):
  <input type="text" name="binary" placeholder="binary value" onkeyup="numbersonly(this)" maxlength="8"  >
  <input type="submit" value="Submit">
  <input type="reset"> 
</form>

<script type="text/javascript">
function numbersonly(input){
	var regex = /[^0-1]/g;
	input.value=input.value.replace(regex,"");
	}
</script>


<body>


<%String result_dec=(String)request.getAttribute("Decimal_Result"); 
String result_hex=(String)request.getAttribute("Hexadecimal_Result"); %>
<br><%out.println("Your Decimal Value is "+result_dec);%>
<br><%out.println("Your Hexadecimal Value is "+result_hex);%>

<% if (result_dec==null)  //if user havent put in the binary value prompt user to enter binary value
{
	out.println("please enter your binary value");
	
	
}

%>

</body>
<p>Developed by: Mony Puthichak Leak (29993)</p>
</div>

</html>