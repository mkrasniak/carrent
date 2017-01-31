angular.module('myApp', []).controller('appController', function() {
	var rent = this;
	rent.cars = [{}];

	rent.addCar = function() {
		rent.cars.push({});
		console.log(rent.cars);
		};
		
	rent.removeCar = function(index) {
		rent.cars.splice(index, 1);
	};
});
