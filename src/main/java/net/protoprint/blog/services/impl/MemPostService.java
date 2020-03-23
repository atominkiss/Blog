package net.protoprint.blog.services.impl;

import net.protoprint.blog.dto.Post;
import net.protoprint.blog.services.api.PostService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MemPostService implements PostService {
	private List<Post> posts = new ArrayList<>(Arrays.asList(
			Post.builder()
					.title("First title")
					.body("First body")
					.img("/img/vaeIF.png")
					.author("First author")
					.build(),
			Post.builder()
					.title("Second title")
					.body("Second body")
					.img("/img/vaeIF.png")
					.author("Second author")
					.build(),
			Post.builder()
					.title("Third title")
					.body("Third body")
					.img("/img/vaeIF.png")
					.author("Third author")
					.build())
	);

	@Override
	public List<Post> search(String query) {
		return query!=null && !query.isEmpty() ?
				posts.stream().filter(post ->
						post.getTitle().toLowerCase().matches(".*" + query.toLowerCase() + ".*"))
						.collect(Collectors.toList())
				:
				posts;
	}

}
