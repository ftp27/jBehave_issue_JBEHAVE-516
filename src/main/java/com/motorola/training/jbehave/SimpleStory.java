package com.motorola.training.jbehave;
import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.failures.FailingUponPendingStep;
import org.jbehave.core.io.UnderscoredCamelCaseResolver;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;


public class SimpleStory extends JUnitStory {
		public SimpleStory()
		{
			Configuration configuration = new MostUsefulConfiguration();
			configuration.useStoryPathResolver(new UnderscoredCamelCaseResolver(".story"));
			configuration.useStoryReporterBuilder(new StoryReporterBuilder().withDefaultFormats().withFormats(Format.CONSOLE));
			configuration.usePendingStepStrategy(new FailingUponPendingStep());
			useConfiguration(configuration);
		}

        public List<CandidateSteps> candidateSteps() {
            return new InstanceStepsFactory(configuration(), new SimpleStorySteps()).createCandidateSteps();
        }
}
