<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/alteraEmpresa" var="linkServletNovaEmpresa"/>


<!DOCTYPE html>
<html lang="en">
<head>
     <meta charset="UTF-8">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <title>Document</title>
</head>
<body>

     <form action="${linkServletNovaEmpresa }" method="post">
     
     Nome: <input type="text" name="nome" value="${empresa.nome }"/>
     
     Data Abertura: <input type="text" name="data" value="<fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyy" />"/>
     <input type="hidden" name="id" value="${empresa.id }">
     <input type="submit"  />
     	
     </form>
</body>
</html>