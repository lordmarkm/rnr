define(['/app/app.js'], function(app) {
  'use strict';
  return app.config(function($stateProvider) {
    $stateProvider.state('home', {
      url: '/',
      templateUrl: '/app/home.html'
    });
  });
});