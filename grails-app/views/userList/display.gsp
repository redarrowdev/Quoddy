<html>
	
	<head>
		<title>Quoddy: Display LIST</title>
		<meta name="layout" content="main" />
	     <nav:resources />		
	</head>
	
	<body>		
		<p />
        <g:if test="${session.user != null}">
        
			<g:if test="${activities != null}">

				<div id="activityStream">
				
					<g:render template="/ulistStream" />
				
				</div>
			</g:if>
		</g:if>
	</body>
</html>