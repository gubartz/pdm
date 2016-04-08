<?php
// Routes

$app->get('/departamento/list', function ($request, $response) {

	$db = $this->db;
	foreach($db->query('SELECT * FROM dep') as $row){
		$return[] = $row;
	};

	return $response->withJson($return);
});


$app->get('/[{name}]', function ($request, $response, $args) {
    // Sample log message
    $this->logger->info("Slim-Skeleton '/' route");

    // Render index view
    return $this->renderer->render($response, 'index.phtml', $args);
});