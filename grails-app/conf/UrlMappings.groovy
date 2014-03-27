class UrlMappings {

	static mappings = {
		"/invader/$id"(controller: "invader")

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
