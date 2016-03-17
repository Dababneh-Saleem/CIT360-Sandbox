<!DOCTYPE html>
<html>
    <head>
        <title>My Stories - SaleemDababneh.com - A Tour of the Past</title>
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
                        <a href="/funfacts/stories/mystories.php"><img src="/images/my_stories.jpg" alt="My Stories" title="My Stories"/></a>
                        <h1>Stories from My Life</h1>
                        <p>Come back soon to hear stories from my past. If you remember any good stories about me please share them with me via the<br />
                            contact me page link found at the bottom of this site.<br />
                        </p>

                        <h3>Story 1 - </h3>
                        <audio controls preload="none">
                            <source src="/multimedia/story_name_test.mp3">
                            <source src="/multimedia/story_name_test.ogg">
                            <p>Your browser does not support HTML5 audio.  You can 
                            <a href="/multimedia/story_name_test.zip" title="download a zipped MP3
                            file"> download a zipped version</a> of the file in MP3
                            format to listen to on your own MP3 player by right-clicking
                            the link and selecting "Save as...".</p>
                        </audio>
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