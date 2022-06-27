{/* <reference path="https://ajax.googleapis.com/ajax/libs/angularjs/1.8.2/angular.min.js"/> */}


// creation Module
//var myApp=angular.module("myModule",[]);

// creating controller

// var myController=function($scope){
//     $scope.message="Learning ANGULAR JS";

// }


//Register the Controller with Module
//myApp.controller("myController",myController)

// WIthout Creating Separate contoller, Directly Register module with controller
// myApp.controller("myController",function($scope){

//     $scope.message="ANGULAR JS _ PROJECT";
// });

// myApp.controller("myController",function($scope){

//     let employee={
//         first:"pavan",
//         last:"kalyan",
//         age:22
//     }

//     $scope.emp=employee;
// });

// Using METHOD CHINING CREATE in SINGLE LINE

// var myApp=angular
//                 .module("myModule",[])
//                 .controller("myController",function($scope){
//                     let concept={
//                                 first:"ANGULAR JS",
//                                 last:"TYPESCRIPT",
//                                 icon:"https://th.bing.com/th/id/OIP.SbhLGLIYSyRianoNmB5zRwHaHa?pid=ImgDet&rs=1"
//                             }
//                             $scope.emp=concept;
                        
//                 })



// TWO WAY DATA BINDING
// var myApp=angular
//                 .module("myModule",[])
//                 .controller("myController",function($scope){
//                     let concept={
//                                 first:"PAVAN",
//                                 last:"KALYAN",
//                                 age:22
//                             }
//                             $scope.emp=concept;
                        
//                 })


// Handling events in AngularJS
// var myApp=angular
//                 .module("myModule",[])
//                 .controller("myController",function($scope){
//                     let tech=[{name:'JAVA',likes:0,dislikes:0},
//                               {name:'PYTHON',likes:0,dislikes:0},
//                               {name:'JAVASCRIPT',likes:0,dislikes:0},]

//                     $scope.tech=tech;

//                     $scope.incrlikes=function(techn){
//                         techn.likes++;
//                     }

//                     $scope.incrdislikes=function(techn){
//                         techn.dislikes++;
//                     }
                        
//                 })
var myApp=angular.module("myModule",[]).controller("myController",function($scope,$location,$http){
    $scope.myURL=$location.absUrl();
    $http.get("http://localhost:3001/list").then(function(response){
        console.log("data",response)
        $scope.data=response.data;
    })
})
