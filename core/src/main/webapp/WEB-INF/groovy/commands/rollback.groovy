import org.crsh.shell.ScriptException;
import org.kohsuke.args4j.Argument;
import org.crsh.shell.Description;

@Description("Discards the changes of the current session or a node")
public class rollback extends org.crsh.shell.ClassCommand {

  @Argument(required=false,index=0,usage="The path of the node to rollback")
  def String path;

  public Object execute() throws ScriptException {
    assertConnected();
    def node = findNodeByPath(path);
    node.refresh(false);
  }
}