import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 2017. 04. 05..
 */
public class Blog {
  private List<BlogPost> blogposts;

  public Blog() {
    this.blogposts = new ArrayList<>();
  }

  public void addBlogPost(BlogPost blogPost) {
    blogposts.add(blogPost);
  }

  public void delete(int n) {
    blogposts.remove(n);
  }

  public void update(int m, BlogPost blogPost) {
    blogposts.set(m, blogPost);
  }
}
