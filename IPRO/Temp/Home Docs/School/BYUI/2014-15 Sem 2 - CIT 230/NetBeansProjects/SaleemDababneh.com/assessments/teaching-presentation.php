<!DOCTYPE html>
<html>
    <head>
        <title>Teaching Presentation - SaleemDababneh.com - A Tour of the Past</title>
        <?php include $_SERVER['DOCUMENT_ROOT'].'/modules/head.php'; ?>
    </head>
    <body>

                        <?php include $_SERVER['DOCUMENT_ROOT'].'/modules/header.php'; ?>


            <tr>
                <td>
                    <nav>
                        <?php include $_SERVER['DOCUMENT_ROOT'].'/modules/nav.php'; ?>
                    </nav>
                </td>
            </tr>

            <tr>
                <td class="padding">
		<main>
                    <div class="main">
                    <h1>Teaching Presentation</h1>
			<p>
                            Here you will find a teaching presentation on HTML5 Head Elements.  There is a video of my PowerPoint presentation below 
                            that also includes a voice over narration of each slide.  In addition to the video presentation, you can find the main body
                            of my presentation below.  
                        </p>
                        <div class="center">
                            <video controls preload="none">
                                <source src="../multimedia/head_elements_teaching_presentation.mp4" type="video/mp4">
                                <source src="../multimedia/head_elements_teaching_presentation.webm" type="video/webm">
                                <source src="../multimedia/head_elements_teaching_presentation.ogv" type="video/ogv">
                                    <p>Your browser does not support HTML5 video.  You can 
                                        <a href="../multimedia/headelements.zip" title="download a zipped MP4 file"> 
                                        download a zipped version</a> of the file in MP4 format to watch on your
                                        local machine by right-clicking the link and selecting "Save as..."</p>
                            </video>
                            <p>You can <a href="../multimedia/head_elements_ppt.pptx" title="download a zipped PowerPoint file"> 
                                        download a PowerPoint version</a> of the file in PPTX format to view on your
                                        local machine by right-clicking the link and selecting "Save as..."</p>
                        </div>
                        <p>
                            TITLE ELEMENT - The HTML <code>&lt;title&gt;</code> Element is meta data.  It defines the HTML document’s title.  The title will not 
                            be displayed in the document, but might be displayed in the browser tab.  The title provides a name for a page 
                            when added to favorites and is the display name for the page in search engine results. <br /> 
                            <br /> 
                            Notice in each example below how the title appears in the browser's tab label:<br /> 
                            <img src="../images/title_examples.png" alt="HTML5 Title Element Example" title="HTML5 Title Element Example" /><br />
                        </p>
                        <br />
                        <p>
                            META ELEMENT - Meta data means data about data.  HTML meta data is data about the HTML document. The HTML <code>&lt;meta&gt;</code> 
                            element is also meta data.  It can be used to define the character set, and other information about the HTML document.<br />
                            <br /> 
                            Notice in each example below how the meta element appears in the HTML document Head section so that it can define itself:<br /> 
                            <img src="../images/meta_examples.png" alt="HTML5 Meta Element Example" title="HTML5 Meta Element Example" /><br />
                        </p>
                        <br />
                        <p>
                            LINK ELEMENT - The HTML <code>&lt;link&gt;</code> Element defines the page relationship to an external resource. The link is most often 
                            used to link to style sheets as in the online example found <a href='http://www.w3schools.com/html/tryit.asp?filename=tryhtml_head_link' target="_blank" title="HTML Link Example"><u>here</u></a>
                            .  Try the ‘See Results’ button before and after changing the css reference on the left side of that example.<br />
                            <br /> 
                            Questions to consider: <br />
                            Where in this sample code is the background color defined?<br />
                            What color is the background when the href is pointing to a bad link?<br />
                        </p>
                        <br />
                        <p>
                            SCRIPT ELEMENT - The HTML <code>&lt;script&gt;</code> Element is used to define client-side JavaScripts. The script below writes 
                            ‘Hello JavaScript!’ into an HTML element with id=“demo”:
                            <br /> 
                            <img src="../images/helloworld_examples.png" alt="HTML5 Script Element Example" title="HTML5 Script Element Example" /><br />
                            Note how in the above sample the <code>&lt;script&gt;</code> tag is closed out with an end tag of <code>&lt;/script&gt;</code>.<br />
                            <br />
                            SCRIPT ELEMENT USE CASES:<br />
                            The Script element can be used to add dynamic controls to a page that will leverage the client-side system to perform 
                            operations such as calculations, dynamic comments, style changes and more.  <br />
                            <br />
                            Here are a few examples to test out:<br />
                            Date & Time calculations – <a href='http://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst' target="_blank" title="HTML Link Example"><u>Date/Time Script Example</u></a><br />
                            Changing existing content - <a href='http://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html' target="_blank" title="HTML Link Example"><u>Change Content Script Example</u></a><br />
                            Interactive Displays - <a href='http://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_lightbulb' target="_blank" title="HTML Link Example"><u>Interactive Script Example</u></a><br />
                        </p>
                    </div>
		</main>
                </td>
            </tr>

            <tr>
                <td class="center">
                    <footer>
                        <?php include $_SERVER['DOCUMENT_ROOT'].'/modules/footer.php'; ?>
                    </footer>
            </table>
                            <div class='footerbar'>&nbsp;</div>
        </body>
</html>