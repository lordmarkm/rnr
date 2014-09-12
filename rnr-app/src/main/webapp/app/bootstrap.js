define([
  'require',
  'angular',
  '/app/app.js',
  '/app/routes.js',
  '/app/modules/player/module.js',
], function (require, angular) {
  'use strict';
  require(['domReady!'], function (document) {
    angular.bootstrap(document, ['op-app']);
  });
});