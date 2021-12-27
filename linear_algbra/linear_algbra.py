import numpy as np
import matplotlib.pyplot as plt

vector = np.array([2,-1])

plt.plot([0,vector[0]],[0,vector[1]])

plt.axis([-3,3,-3,3])

plt.show()
