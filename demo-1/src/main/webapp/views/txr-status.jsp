<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bank-mts</title>
<link href="css/bootstrap.css" rel="stylesheet">
</head>
<body class="container">

	
	<div class="page-header">bank-mts</div>
	
	<div class="col-sm-4 col-md-4 col-sm-5"> 
		<div class="panel panel-primary">
		<div class="panel-heading">Txr Status</div>
		<div class="panel-body">
				<div class="alert alert-info">${param.status?'Txr successfull':'Txr Failed'}</div>
		</div>
		</div>
	</div>

</body>
</html>