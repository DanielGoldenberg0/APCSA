package com.company.FRQs;

public class Sound
{
    private int[] samples;

    public int limitAmplitude(int limit)
    {
        int numChanged = 0;

        for (int i = 0; i < samples.length; i++)
        {
            if (samples[i] >= 0 && samples[i] > limit)
            {
                samples[i] = limit;
                numChanged++;
            }
            else if (samples[i] < 0 && samples[i] < limit)
            {
                samples[i] = -limit;
                numChanged++;
            }
        }

        return numChanged;
    }

    public void trimSilenceFromBeginning()
    {
        int silenceCount = 0;

        for (int sample : samples)
        {
            if (sample == 0)
            {
                silenceCount++;
            }
            else
            {
                break;
            }
        }

        int[] newSamples = new int[samples.length - silenceCount];

        for (int i = 0; i < samples.length; i++)
        {
            if (samples[i+1] == 0)
            {
                continue;
            }

            newSamples[i] = samples[i];
        }

        samples = newSamples;
    }
}
