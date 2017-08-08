<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:fn="http://www.w3.org/2005/xpath-functions">
	<xsl:output encoding="UTF-8" method="html"/>
	<xsl:variable name="username">
		用户姓名
	</xsl:variable>
	<xsl:param name="mygender" select="/users/user[1]/gender">
	</xsl:param>
	<xsl:template match="/">
		<html>
			<head>
				<title>用户列表</title>
			</head>
			<body>
				<xsl:call-template name="users">
						<xsl:with-param name="bgcolor" select="'blue'" />
				</xsl:call-template>
			</body>
		</html>
	</xsl:template>
	<xsl:template name="users">
		<xsl:param name="bgcolor" />
		<table border="1" align="center" width="400px" style="background-color={$bgcolor}">
			<tbody>
				<tr>
					<th><xsl:value-of select="$username"></xsl:value-of></th>
					<th>性别</th>
					<th>年龄</th>
					<th>收入</th>
				</tr>
				<xsl:apply-templates />
			</tbody>
		</table>
	</xsl:template>
	<xsl:template match="user">
		<tr>
			<td>
				<xsl:value-of select="name"/>
			</td>
			<td>
				<xsl:value-of select="gender"/>
			</td>
			<td>
				<xsl:value-of select="age"/>
			</td>
			<td>
				<xsl:choose>
					<xsl:when test="income &lt; 2000">太低</xsl:when>
					<xsl:when test="income &lt; 5000">一般</xsl:when>
					<xsl:when test="income &lt; 7000">较高</xsl:when>
					<xsl:otherwise>很高</xsl:otherwise>
				</xsl:choose>
			</td>
		</tr>
	</xsl:template>
</xsl:stylesheet>
