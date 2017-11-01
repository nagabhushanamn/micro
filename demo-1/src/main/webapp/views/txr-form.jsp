<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/bootstrap.css" rel="stylesheet">
</head>
<body class="container">

	
	<div class="page-header">bank-mts</div>
	
	<div class="col-sm-4 col-md-4 col-xs-5"> 
		<div class="panel panel-primary">
		<div class="panel-heading">Txr Form</div>
		<div class="panel-body">
			<form action="txr" method="post">
				<div class="form-group">
					<label>Amount:</label>
					<input name="amount" class="form-control">
				</div>
				<div class="form-group">
					<label>From Account:</label>
					<input name="fromAccNum" class="form-control">
				</div>
				<div class="form-group">
					<label>ToAccount:</label>
					<input name="toAccNum" class="form-control">
				</div>
				<button class="btn btn-primary">Txr</button>
			</form>
		</div>
		</div>
	</div>

</body>
</html>