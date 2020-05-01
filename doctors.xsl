<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/doctors">

<html>
<body>
<xsl:for-each select="doctor">

<xsl:value-of select="name"><br>
<xsl:value-of select="email"><br>
<xsl:value-of select="dept"><br>
<xsl:value-of select="mobile"><br>
<xsl:value-of select="name"><br>

</xsl:for-each>
</body>
</html>



</xsl:template>

</xsl:stylesheet>