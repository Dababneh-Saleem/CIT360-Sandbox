<!DOCTYPE html>
<html>
    <head>
        <title>Prison Breakout Participant Registration - Prison to Prison Triathlon</title>
        <?php include $_SERVER['DOCUMENT_ROOT'].'/triathlon/modules/head.php'; ?>
    </head>
    <body>

                        <?php include $_SERVER['DOCUMENT_ROOT'].'/triathlon/modules/header.php'; ?>


            <tr>
                <td>
                    <nav>
                        <?php include $_SERVER['DOCUMENT_ROOT'].'/triathlon/modules/nav.php'; ?>
                    </nav>
                </td>
            </tr>

            <tr>
                <td class="padding">
                    <main>
                        <div class="main">
                        <h1>Register for the Prison Breakout Event</h1>
                            <h4>
                                Do you have what it takes to "Breakout" or will you choose to sit in your cell and waste your life away?  <br />
                                Will you pony up the $100 registration fee for your one chance to be free this year?
                            </h4>

                        <?php
                         
                        if(!empty($errors)) {
                            echo '<ul class="notify">';
                            foreach($errors as $error){
                                echo "<li>$error</li";
                            }
                            echo '/ul>';
                            unset($errors);
                            }
                        ?>
                        <p>Please use this form to register for the Prison Breakout Triathlon.  (Please note: All fields are required.)</p>
                        <form method="post" action="." id="contactform">
                            <label for="participant_type">Please select your participation level (Participant, Volunteer or Sponsor): </label><br />
                            <select name="participant_type" id='participant_type'>
                                <option value="Particpant">Participant</option>
                                <option value="Volunteer">Volunteer</option>
                                <option value="Sponsor">Sponsor</option>
                            </select><br /><br />
                            
                            <label for="firstname">First Name: </label><br />
                            <input type="text" name="firstname" id="firstname" size="50" value="<?php echo $firstname; ?>" required><br /><br />
                            
                            <label for="lastname">Last Name: </label><br />
                            <input type="text" name="lastname" id="lastname" size="50" value="<?php echo $lastname; ?>" required><br /><br />
                            
                            <label for="email">Email Address: </label><br />
                            <input type="email" name="email" id="email" size="50" value="<?php echo $email; ?>" required><br /><br />
                            
                            <label for="phone">Phone Number: </label><br />
                            <input type="text" name="phone" id="phone" size="18" value="<?php echo $phone; ?>" required><br /><br />
                            
                            <label for="e_contact">Emergency Contact Name & Number: </label><br />
                            <textarea name="e_contact" id="e_contact" cols="50" rows="10" required><?php echo $e_contact; ?></textarea><br /><br />
                            
                            <!-- This displays the captcha image -->
                            <label>&nbsp;</label><img id="captcha" src="captcha_images.php?width=200&amp;height=40&amp;characters=5" alt="captcha image"><br />
                            (Type the characters you see in the above image into the text box below)<br />
                            
                            <!-- This allows the user to type in what they see -->
                            <label for="cap_code">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Security Code:</label> &nbsp; <input id="cap_code" name="cap_code" type="text" size="7" required>
                            
                            <br /><br /><br />
                            <h4>
                            <label for='action'>*REMINDER* - The cost to enter is $100, due on the morning of the race (cash only).  
                                A small price to pay for your shot at freedom.</label><br /><br />
                            <input type='submit' name="action" id='action' value="Submit"><br />
                            </h4>
                        </form>
                        </div>
                        <br />
                        <br />
                        <div class="main">
                            *****NOTE: This site has been built as part of a college course and the registration page is merely here for demo purposes.
                            There is no actual race being held nor will your registration enroll you in the triathlon. This is a ficticious
                            event that has been used as an example of how to design and build a website.*****  
                        </div>
                </main>
                </td>
            </tr>

            <tr>
                <td class="center">
                    <footer>
                        <?php include $_SERVER['DOCUMENT_ROOT'].'/triathlon/modules/footer.php'; ?>
                    </footer>
                </td>
            </tr>
        </table>
    </body>
</html>