/**
 * @author Tarique
 */
package edu.uiuc.zenvisage.zqlcomplete.querygraph;

import java.util.List;

import edu.uiuc.zenvisage.data.remotedb.VisualComponent;
import edu.uiuc.zenvisage.data.remotedb.VisualComponentList;

/**
 * @author tarique
 *
 */
public interface D {
	public  AxisVariableScores  execute(VisualComponentList f1, VisualComponentList f2, List<List<AxisVariable>> axisVariables);
	public double calculateDistance(VisualComponent v1, VisualComponent v2);
}
