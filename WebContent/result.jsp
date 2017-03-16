<!DOCTYPE html>
<%@page import="org.apache.taglibs.standard.tag.el.core.ForEachTag"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.StudentGrade"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Result</title>
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
						</div>
						<div class="panel-body">
							<%
								ArrayList<StudentGrade> DataArray = (ArrayList<StudentGrade>) request.getAttribute("stGrades");
								for (StudentGrade d : DataArray) {
									out.print("<table class='table table-responsive'>");
									out.print("<tr><th>Name:</th><td>" + d.getName() + "</td></tr>");
									out.print("<tr><th>ID:</th><td>" + d.getId() + "</td></tr>");
									out.print("<tr><th>Mark:</th><td>" + d.getMark() + "</td></tr>");
									out.print("<tr><th>Cgpa:</th><td>" + d.getCgpa() + "</td></tr>");
									out.print("<tr><th>Grade:</th><td>" + d.getGrade() + "</td></tr>");
									out.print("</table>");
								}
							%>

							<a href="index.html" class="btn btn-primary">Calculate
								Another</a>
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