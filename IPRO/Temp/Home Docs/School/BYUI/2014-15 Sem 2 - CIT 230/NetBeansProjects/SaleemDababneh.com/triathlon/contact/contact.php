<!DOCTYPE html>
<html>
    <head>
        <title>Contact Us - Prison Breakout Team - Prison to Prison Triathlon</title>
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
                        <h1>Contact the Prison Breakout Team</h1>
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
                        <p>Please use this form to contact the Prison Breakout team.  All fields are required.</p>
                        <form method="post" action="." id="contactform">
                            <label for="name">Name:</label><br />
                            <input type="text" name="name" id="name" size="50" value="<?php echo $name; ?>" required><br /><br />
                            
                            <label for="email">Email</label><br />
                            <input type="email" name="email" id="email" size="50" value="<?php echo $email; ?>" required><br /><br />
                            
                            <label for="subject">Subject</label><br />
                            <input type="text" name="subject" id="subject" size="50" value="<?php echo $subject; ?>" required><br /><br />
                            
                            <label for="message">Message</label><br />
                            <textarea name="message" id="message" cols="50" rows="10" required><?php echo $message; ?></textarea><br /><br />
                            
                            <!-- This displays the captcha image -->
                            <label>&nbsp;</label><img id="captcha" src="captcha_images.php?width=100&amp;height=40&amp;characters=5" alt="captcha image">
                            (Type these characters into the text box below)<br />
                            
                            <!-- This allows the user to type in what they see -->
                            <label for="cap_code">&nbsp; Security Code:</label> &nbsp; <input id="cap_code" name="cap_code" type="text" size="7" required>
                            
                            <label for='action'>&nbsp;</label><br /> 
                            <input type='submit' name="action" id='action' value="Send"><br />
                        </form>
                        </div>
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