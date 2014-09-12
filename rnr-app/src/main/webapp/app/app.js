define([
  'angular',
  'bootstrap',
  'uiRouter',
  'ngResource',
  'ngTable',
  'sugar',
  '/app/controllers/controllers.js'
], function (angular) {
  'use strict';
  return angular.module('op-app', [
    'ui.router',
    'ngResource',
    'ngTable',
    'app.controllers'
  ]);

});