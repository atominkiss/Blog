package net.protoprint.blog.services.api;

import net.protoprint.blog.dto.Post;

import java.util.List;

public interface PostService {
	List<Post> search(String query);

}
