class UrlMappings {

	static mappings = {
		"/invader/$name"(controller: "invader")

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
