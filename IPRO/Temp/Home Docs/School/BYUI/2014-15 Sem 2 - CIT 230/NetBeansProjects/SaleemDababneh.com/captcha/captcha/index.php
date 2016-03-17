<?php
/*
 * A controller to handle the contact page processing
 */
 session_start();

if($_POST['action'] == 'Send'){
 
} else {
 include 'contact.php';
 exit;
}
?>