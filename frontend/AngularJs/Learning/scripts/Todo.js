if (JSON.parse(localStorage.getItem("TODO")) === null) {
  localStorage.setItem("TODO", JSON.stringify([]));
}

var app = angular.module("todoModule", []);

app.controller("todoController", function ($scope) {
  $scope.value="value";
  //$scope.todoData =[];
  $scope.todoData =JSON.parse(localStorage.getItem("TODO"))
  $scope.ed=[];
  for(let i=0;i<$scope.todoData.length;i++){
    $scope.ed[i]="EDIT"
  }
  $scope.action =JSON.parse(localStorage.getItem("TODO"))
$scope.inputTodo="";
  $scope.addTodo = function () {
    if($scope.inputTodo==="" || $scope.inputTodo==null){
      alert("Please Enter todo")
    }else{
      
      $scope.todoData.push($scope.inputTodo);
      $scope.action.push($scope.inputTodo);
      $scope.ed.push("EDIT")
      $scope.inputTodo = "";
    }
    localStorage.setItem("TODO", JSON.stringify($scope.todoData))
   
  };

  $scope.todoRemove = function (index) {
   // $scope.todoData =JSON.parse(localStorage.getItem("TODO"))
    $scope.todoData.splice(index, 1);
    $scope.action.splice(index,1);
    localStorage.setItem("TODO", JSON.stringify($scope.todoData))
    
  
  };


  $scope.todoUpdate=function(index){
                if($scope.ed[index]=="EDIT")
{
  $scope.ed[index] = "UPDATE";
  $scope.value = "";
}
else{

          $scope.todoData[index]=$scope.action[index];
    $scope.ed[index] = "EDIT";
    $scope.value = "close";
    localStorage.setItem("TODO", JSON.stringify($scope.todoData))

}
    
  }
});
