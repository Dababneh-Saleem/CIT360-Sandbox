<!DOCTYPE html>
<html>
    <head>
        <?php include $_SERVER['DOCUMENT_ROOT'].'/modules/head.php'; ?>
    </head>
    <body>
        <header>
            <div align='center'> <img src="/images/sdababneh.jpg" width='935' height='623' alt="Dababneh Family" title="A Tour of my Past" /></div>
            <h1>Saleem Dababneh - A Tour of the Past</h1>
        </header>
        
        <nav>
            <?php include $_SERVER['DOCUMENT_ROOT'].'/modules/nav.php'; ?>
        </nav>
        
        <main>
            <h1>Template Page</h1>
		<p>COMING SOON: This site is being built to be an online tour of my life.  Past, Present & Future.</p>
            <!--This is the container area for the variable content found on each page.
            Additional structural elements such as <article>, <section>, <aside>
            can be included as needed -->
        </main>
        
        <footer>
            <?php include $_SERVER['DOCUMENT_ROOT'].'/modules/footer.php'; ?>
            <p>Last updated: <? echo date('j F, Y', getlastmod()) ?></p>
        </footer>
    </body>
</html>