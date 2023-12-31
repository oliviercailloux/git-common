package io.github.oliviercailloux.git.common;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.oliviercailloux.git.common.GitUri;
import io.github.oliviercailloux.git.common.RepositoryCoordinates;
import org.junit.jupiter.api.Test;

public class RepositoryCoordinatesTests {
  @Test
  void testUri() throws Exception {
    final GitUri obtained = RepositoryCoordinates
        .from("git@github.com", "oliviercailloux-org", "minimax-ex").asGitUri();
    assertEquals("ssh://git@github.com/oliviercailloux-org/minimax-ex.git", obtained.asString());
  }
}
