define([
  '/app/app.js'
  ], 
  function(app) {
    'use strict';
    return app.config(function($stateProvider) {
      $stateProvider.state('character_creation', {
        url: '/player/character_creation',
        templateUrl: '/app/modules/player/character_creation/home.html',
        controller: 'CharacterCreationController'
      });
    }
  );
});