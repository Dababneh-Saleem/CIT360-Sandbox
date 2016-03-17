<!DOCTYPE html>
<html>
    <head>
        <title>Contact Me - SaleemDababneh.com - A Tour of the Past</title>
        <?php include $_SERVER['DOCUMENT_ROOT'].'/modules/head.php'; ?>
    </head>
    <body>
        <table style='margin-left:auto; margin-right:auto; width:1000'>
            <tr>
                <td style='text-align:center'>
                    <header>
                        <?php include $_SERVER['DOCUMENT_ROOT'].'/modules/header.php'; ?>
                    </header>   
                </td>
            </tr>

            <tr>
                <td>
                    <nav>
                        <?php include $_SERVER['DOCUMENT_ROOT'].'/modules/nav.php'; ?>
                    </nav>
                </td>
            </tr>

            <tr>
                <td style='padding:50px 0px 50px 0px'>
                    <main>
                        <h1>Contact Me</h1>
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
                        <p>Please use this form to contact me.  All fields are required.</p>
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
                </main>
                </td>
            </tr>

            <tr>
                <td style='text-align:center'>
                    <footer>
                        <?php include $_SERVER['DOCUMENT_ROOT'].'/modules/footer.php'; ?>
                    </footer>
                </td>
            </tr>

        </table>
    </body>
</html>