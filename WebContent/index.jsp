<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student CGPA Calculator</title>
<link href="css/bootstrap.css" rel="stylesheet">
</head>
<body>
	<div class="content">
		<div class="row">
			<div class="col-md-12">
				<div class="col-md-4 col-md-offset-4">
					<div class="panel panel-info">
						<div class="panel-heading">
							<h5 class="panel-title">Student Result Processing....</h5>
							<div class="alert alert-success">
								<h6>successfully inserted!</h6>
							</div>
						</div>
						<div class="panel-body">
							<form action="/EEHomeWork_1/StudentInfoForm" method="get">
								<div class="form-group">
									<label class="label label-primary">Student Name</label> <input
										type="text" class="form-control" placeholder="student name"
										name="name" />
								</div>
								<div class="form-group">
									<label class="label label-primary">Student ID</label> <input
										type="text" class="form-control" placeholder="student ID"
										name="id" />
								</div>
								<hr />
								<h2 class="btn-warning" style="text-align: center">Marks</h2>
								<div class="form-group">
									<label class="label label-primary">Data Structure</label> <input
										type="text" class="form-control" placeholder="data structure"
										name="data" />
								</div>
								<div class="form-group">
									<label class="label label-primary">Compiler Design</label> <input
										type="text" class="form-control" placeholder="compiler design"
										name="compiler" />
								</div>
								<div class="form-group">
									<label class="label label-primary">Machine Learning</label> <input
										type="text" class="form-control"
										placeholder="machine learning" name="machine" />
								</div>
								<div class="form-group">
									<label class="label label-primary">OOP</label> <input
										type="text" class="form-control"
										placeholder="object oriented programmming and uml" name="oop" />
								</div>
								<div class="form-group">
									<label class="label label-primary">Digital Logic Design</label>
									<input type="text" class="form-control"
										placeholder="digital logic design" name="digital" />
								</div>
								<div class="form-group">
									<input type="checkbox" class="form-control"
										placeholder="finish" name="choice" /> Finish and show result
								</div>
								<div class="form-group">
									<input type="submit" class="btn btn-success" value="Entry" />
								</div>
							</form>
						</div>
						<div class="panel-footer">
							<p style="text-align: center">
								<small>Copyright Reserved @ Abdullahil Ashik Md Arefin</small>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>