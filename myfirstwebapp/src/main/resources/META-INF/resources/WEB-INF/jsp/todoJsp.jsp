<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>This is the todo page</title>
</head>
<body>
   Hi ${name}
   <br>
   <h2>Your pending tasks are :</h2> 
   <table>
     <thead>
        <tr>
          <th>id</th>
          <th>username</th>
          <th>Description</th>
          <th>TargetDate</th>
          <th>isDone</th>
        </tr>
     </thead>
     <tbody>
         <c:forEach items="${yourTodo}" var="todos">
				<tr>
					<th>${todos.id}</th>
					<th>${todos.username}</th>
					<th>${todos.description}</th>
					<th>${todos.targetDate}</th>
					<th>${todos.isdone}</th>
				</tr>
		 </c:forEach>
     </tbody>
   </table>
</body>
</html>