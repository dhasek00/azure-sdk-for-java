# coding=utf-8
# --------------------------------------------------------------------------
# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License. See License.txt in the project root for
# license information.
#
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model
from msrest.exceptions import HttpOperationError


class Error(Model):
    """Error

    :param status:
    :type status: int
    :param constant_id:
    :type constant_id: int
    :param message:
    :type message: str
    """ 

    _attribute_map = {
        'status': {'key': 'status', 'type': 'int'},
        'constant_id': {'key': 'constantId', 'type': 'int'},
        'message': {'key': 'message', 'type': 'str'},
    }

    def __init__(self, status=None, constant_id=None, message=None, **kwargs):
        self.status = status
        self.constant_id = constant_id
        self.message = message


class ErrorException(HttpOperationError):
    """Server responsed with exception of type: 'Error'.

    :param deserialize: A deserializer
    :param response: Server response to be deserialized.
    """

    def __init__(self, deserialize, response, *args):

        super(ErrorException, self).__init__(deserialize, response, 'Error', *args)
