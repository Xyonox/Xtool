<!DOCTYPE html>
<html lang="de">
<body>
    <h1>Gradle</h1>
<div>  
<p>Repositories</p>

    repositories {
			...
			maven { url 'https://jitpack.io' }
		}

</div>  
<div>
    <p>Dependencies</p>

	dependencies {
	        implementation 'com.github.Xyonox:Xtool:VERSION'
	}
</div>
<br>
<h1>Maven</h1>
<div>  
<p>Repositories</p>
	
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>

</div>  
<div>
    <p>Dependencies</p>

	<dependency>
	    <groupId>com.github.Xyonox</groupId>
	    <artifactId>xtool</artifactId>
	    <version>VERSION</version>
	</dependency>

</div>

</body>
</html>
