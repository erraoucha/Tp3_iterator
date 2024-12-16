package com.hel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.assertj.core.api.Assertions.*;
import java.time.LocalDate;

import org.junit.Test;

import com.erraoucha.Person;

import java.util.HashSet;
import java.util.Set;

public class TestPersonWithoutIterator {
    
  public static void main ( String [] args ) {
 Set < Person > people = new HashSet < >() ;
 people . add (new Person (1 , " Alice ") ) ;
 people . add (new Person (2 , "Bob ") ) ;
 people . add (new Person (3 , " Charlie ") ) ;

// Suppression sans iterator ( provoque ConcurrentModificationException )

 for ( Person person : people ) {
if ( person . getName () . equals ("Bob") ) {
 people . remove ( person ) ; // Erreur ici
 }
 }
 } 
}