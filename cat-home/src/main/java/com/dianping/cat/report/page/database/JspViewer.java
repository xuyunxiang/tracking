package com.dianping.cat.report.page.database;

import com.dianping.cat.report.ReportPage;
import org.unidal.web.mvc.view.BaseJspViewer;

public class JspViewer extends BaseJspViewer<ReportPage, Action, Context, Model> {
	@Override
	protected String getJspFilePath(Context ctx, Model model) {
		Action action = model.getAction();

		switch (action) {
		case HOURLY_REPORT:
			return JspFile.HOURLY.getPath();
		case HISTORY_REPORT:
			return JspFile.HISTORY.getPath();
		}

		throw new RuntimeException("Unknown action: " + action);
	}
}
