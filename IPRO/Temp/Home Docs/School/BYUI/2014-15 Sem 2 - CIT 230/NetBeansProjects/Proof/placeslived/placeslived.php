<!DOCTYPE html>
<html>
    <head>
        <title>Places Lived - SaleemDababneh.com - A Tour of the Past</title>
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
                        <h1>Places I Have Lived</h1>
                            <p>Here is a video slideshow of the homes that I have lived in during my life.  </p>
                        <div style="text-align: center">
                            <video controls preload="none">
                                <source src="../multimedia/placescalledhome.mp4" type="video/mp4">
                                <source src="../multimedia/placescalledhome.webm" type="video/webm">
                                <source src="../multimedia/placescalledhome.ogv" type="video/ogv">
                                    <p>Your browser does not support HTML5 video.  You can 
                                        <a href="../multimedia/placescalledhome.zip" title="download a zipped MP4 file"> 
                                        download a zipped version</a> of the file in MP4 format to watch on your
                                        local machine by right-clicking the link and selecting "Save as..."</p>
                            </video>
                            <br />
                            Using the video controls you can skip forward and back by dragging the slider bar as necessary.<br />
                        </div>
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