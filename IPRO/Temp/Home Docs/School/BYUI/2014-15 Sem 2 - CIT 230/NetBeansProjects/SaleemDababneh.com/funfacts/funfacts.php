<!DOCTYPE html>
<html>
    <head>
        <title>Fun Facts - SaleemDababneh.com - A Tour of the Past</title>
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
                <td class="padding2">
                    <main>
                        <div class="main">
                        <h1>Fun Facts About My Life</h1>
                        <h4>
                            Click the below images to navigate to my Likes/Dislikes or to my Stories.  Just follow the images to get to the next level page.  
                        </h4>
                            <a href="/funfacts/likesdislikes/likesdislikes.php"><img src="/images/like-dislike-stamps.jpg" onload="normalImg(this)" onmouseover="bigImg(this)" onmouseout="normalImg(this)" alt="Likes and Dislikes" title="Likes and Dislikes" class="border"/></a>
                            <a href="/funfacts/stories/mystories.php"><img src="/images/my_stories.jpg" onload="normalImg(this)" onmouseover="bigImg(this)" onmouseout="normalImg(this)" alt="My Stories" title="My Stories" class="border"/></a>    
                            <br />
                                <script>
                                    function bigImg(x) {
                                        x.style.height = "40%";
                                        x.style.width = "40%";
                                    }

                                    function normalImg(x) {
                                        x.style.height = "30%";
                                        x.style.width = "30%";
                                    }
                                </script>
                            <p>
                                The sub-pages will provide fun facts about things I like such as hobbies, foods, places and also describe things 
                                that I do not like. This is also where I will add some audio stories about my life for my children to enjoy.
                                These stories will include tales from my childhood, stories of my journeys and also some stories about my children too.
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
                </td>
            </tr>

        </table>
                        <div class='footerbar'>&nbsp;</div>
    </body>
</html>