#Autor: davilat@choucairtesting.com
  #Date: Jan-05-2022

@orders
Feature: Create order

  Background: the user is logged in the StartSharp Page
    Given User login in the StartSharp with the user 'admin' and password 'serenity'

    Scenario Outline: Create order general
      Given the users has entered the orders functionality
      And enter to create an order
      When fill out the general form <customer>, <requiredDate>, <employee>
      And fill out the order detail form <product>, <quantity>
      And save the order changes
      Then the order is listed in the order table

      Examples:
      |customer|requiredDate|employee|product|quantity|
      |Rancho grande|01/10/2022|Andrew Fuller|chocolade|2|
