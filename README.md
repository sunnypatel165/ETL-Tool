# ETL-Tool

<a href="https://www.dropbox.com/sh/iiwg73q27ia5c4h/AACGd4zQgXkJAMrUYp996IH1a?dl=0"> This is</a> a desktop application that simulates working of a data warehouse process for a telecommunication company, at a very basic level.

The basic steps of any datawarehouse are-
<ul>
<li> <b>Extraction</b>- Extracting from various data stores like text, SQL, Access, CSV etc.
<li> <b>Transformation</b>- Transforms data into certain format(uniform)
<li> <b>Loading</b>- Load the data into a database.
</ul>

The application also has a couple of mining algorithms embedded in it. currently it has <b>Bayes classification, KNN and K means clustering</b>. Various other algorithms like Apriori, Heirarchical clustering etc can also be included.

<b>To run:<br></b>

-Download an extract Zip<br>
-Copy it into your netbeans projects directory<br>
-Build, Compile and Run.

Or<br>
Refer to the <a href="https://www.dropbox.com/sh/iiwg73q27ia5c4h/AACGd4zQgXkJAMrUYp996IH1a?dl=0">Dropbox link</a>. It has screenshots and built JAR file.

Or<br>
Clone the JAR in dist/ETL.jar

<h3>Note for current version:</h3>
Paths used in the code are not relative/real, they are absolute paths refering to my PC, hence one has to change a few paths before getting it to work.<br> Also, to use SQL and JDBC data stores, necessary things may have to be installed like the drivers for JDBC and the MySQL.<br>
Would love pull requests and contributions :)
