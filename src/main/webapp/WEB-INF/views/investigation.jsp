<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br" ng-app="investigationApp">
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Áreas de investigação</title>
	<script type="text/javascript" src="../resources/javascript/angular.min.js"></script>
	<script type="text/javascript" src="../resources/javascript/investigationController.js"></script>
</head>
<body>
  <h3>Canal aberto</h3>
  <br/>
  <br/>
  <h2>Áreas de atuação</h2>
	<table ng-controller="listAll"  data-ng-init="init()">
     <tbody>
       <tr ng-repeat="model in modelList">
         <td>{{ model.interestName }}</td>      
       </tr>
     </tbody>
   </table>
   <a href= "../">Voltar</a>
</body>
</html>