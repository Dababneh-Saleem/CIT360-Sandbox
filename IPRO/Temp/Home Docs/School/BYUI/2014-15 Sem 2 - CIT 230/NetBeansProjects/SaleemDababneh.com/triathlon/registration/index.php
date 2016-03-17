<?php
session_start();
/*
 * A controller to handle the contact page processing
 */
if($_POST['action'] == 'Submit'){
//collect the data sent from the form
    $participant_type = $_POST['participant_type'];
    $firstname = $_POST['firstname'];
    $lastname = $_POST['lastname'];
    $email = $_POST['email'];
    $phone = $_POST['phone'];
    $e_contact = $_POST['e_contact'];
    $captcha = $_POST['cap_code'];
    
//Check the fields that they are not empty
    if(empty($firstname) || empty($lastname)  || empty($email) || empty($phone) || empty($e_contact)){
        $errors['fields'] = 'All fields are required, please fill in each one.';
    }
    
//Check that the captcha code matched the picture
    if(strtolower($_SESSION['security_code']) != strtolower($_POST['cap_code']) && !empty($_SESSION['security_code'])) {
        $errors['security'] = 'Sorry, your entered security code does not match the security image.';
    }
    
 //If there are errors, return the contact page to fix them
    if(!empty($errors)){
        include 'participant.php';
        exit;
    }

//Assemble the message
    $finalmessage = "Participant Type: $participant_type \n";
    $finalmessage .= "First Name: $firstname \n";
    $finalmessage .= "Last Name: $lastname \n";
    $finalmessage .= "Email: $email \n";
    $finalmessage .= "Phone Number: $phone \n";
    $finalmessage .= "Emergency Contact Info: $e_contact \n";

//Send the message
    $to = 'dab13001@byui.edu';
    $from = "From: $email";
    $result = mail($to, $phone, $finalmessage, $from);
        
//Let the sender know what happened
if($result == TRUE) {
    $errors[] = "Thank you, $firstname, for registering for the the Prison Breakout event as a $participant_type.  You will receive an email confirmation within 24 hours.";
}else {
    $errors[] = "Sorry $firstname but there was an error and the registration was not submitted.  Please try again.";
}

//Remove all values previously stored
unset($participant_type);
unset($firstname);
unset($lastname);
unset($email);
unset($phone);
unset($e_contact);
unset($captcha);

//Display the contact page with the new e_contact
 include 'participant.php';
 exit;
}

else {
    include 'participant.php';
    exit;
}
?>